package controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import play.libs.*;
import play.libs.Json;
import play.libs.Json.*;
import static play.libs.Json.toJson;
import org.codehaus.jackson.JsonNode;           
import org.codehaus.jackson.node.ObjectNode; 
import play.mvc.Http.*;

import models.User;
import play.Routes;
import play.data.Form;
import play.mvc.*;
import play.mvc.Http.Response;
import play.mvc.Http.Session;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;

import views.html.*;

import be.objectify.deadbolt.actions.Restrict;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthProvider;

public class Application extends Controller {

	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";
	public static final String USER_ROLE = "user";
	
	public static Result index() {
		return ok(index.render());
	}

	// TODO: when security part is figured out
	// @Restrict(Application.USER_ROLE)
	public static Result create_poll() {
		return ok(create_poll.render());
	}

	// TODO: when security part is figured out
	// make sure no
	// @Restrict(Application.USER_ROLE)
	public static Result create_poll_new() {
        RequestBody body = request().body();
        System.out.println(body.asJson());

        // TODO: shove the data into the database

  		return renderJSON("worked");
 
        // Return the JSON data
        // You have some options here: Play accepts a model object as a parameter, which it will automatically encode it to JSON for you, so this is your best bet if you are returning a single object directly.
        // Otherwise, you can hand-craft a JSON string, but this is best done with a Java JSON encoder library due to automatic character escaping and whatnot (Play uses GSON by Google).
        //renderJSON(someModel);
        //return ok(create_poll.render());
       /* ObjectNode result = Json.newObject();
		  String content = json.findPath("content").getTextValue();
		  if(content == null) {
		    result.put("status", "error");
		    result.put("message", "Missing parameter [content]");
		    return badRequest(result);
		  } else {
		    result.put("status", "OK");
		    result.put("message", content);
		    return ok(result);
		  }*/
    }

	public static User getLocalUser(final Session session) {
		final User localUser = User.findByAuthUserIdentity(PlayAuthenticate
				.getUser(session));
		return localUser;
	}

	@Restrict(Application.USER_ROLE)
	public static Result restricted() {
		final User localUser = getLocalUser(session());
		return ok(restricted.render(localUser));
	}

	@Restrict(Application.USER_ROLE)
	public static Result profile() {
		final User localUser = getLocalUser(session());
		return ok(profile.render(localUser));
	}

	public static Result login() {
		return ok(login.render(MyUsernamePasswordAuthProvider.LOGIN_FORM));
	}

	public static Result doLogin() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MyLogin> filledForm = MyUsernamePasswordAuthProvider.LOGIN_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// User did not fill everything properly
			return badRequest(login.render(filledForm));
		} else {
			// Everything was filled
			return UsernamePasswordAuthProvider.handleLogin(ctx());
		}
	}

	public static Result signup() {
		return ok(signup.render(MyUsernamePasswordAuthProvider.SIGNUP_FORM));
	}

	public static Result jsRoutes() {
		return ok(
				Routes.javascriptRouter("jsRoutes",
						controllers.routes.javascript.Signup.forgotPassword()))
				.as("text/javascript");
	}

	public static Result doSignup() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MySignup> filledForm = MyUsernamePasswordAuthProvider.SIGNUP_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// User did not fill everything properly
			return badRequest(signup.render(filledForm));
		} else {
			// Everything was filled
			// do something with your part of the form before handling the user
			// signup
			return UsernamePasswordAuthProvider.handleSignup(ctx());
		}
	}

	public static String formatTimestamp(final long t) {
		return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").format(new Date(t));
	}

}