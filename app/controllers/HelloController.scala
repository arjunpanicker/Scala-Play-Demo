package controllers

import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.Inject

class HelloController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def hello() = Action {
    implicit  request: Request[AnyContent] => {
      val json: JsValue = Json.obj(
        "name" -> "Arjun Panicker",
        "location" -> Json.obj("lat" -> 51.235685, "long" -> -1.309197),
        "fiance" -> Json.obj(
          "name" -> "Juhi Srivastava",
          "cute" -> "yes"
        ),
        "carsOwned" -> Json.arr("Honda City", "Maruti 800", "Alto")
      )

      Ok(json)
    }
  }
}
