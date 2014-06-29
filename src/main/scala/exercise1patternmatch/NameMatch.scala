package exercise1patternmatch

class NameMatch {

  def find(name: String): String = {
    name match {
      case "James" => s"$name has been found"
      case "Helen" => s"$name has been found"
      case "Garnet" => s"$name has been found"
      case _ => s"$name has not been found"
    }
  }

  def greet(name: String, greetingMessage: String): String = {
    greetingMessage match {
      case "good morning" => s"$greetingMessage $name"
      case "good afternoon" => s"$greetingMessage $name"
      case "good evening" => s"$greetingMessage $name"
      case "good night" => s"$greetingMessage $name"
      case _ => s"greeting not found for $greetingMessage"
    }
  }
}
