import cards.Card
import cards.Deck
import cards.Profile

class BootStrap {
  def cardService

    def init = { servletContext ->
      cardService.create(new Card(content: "first card created"))
      cardService.create(new Card(content: "second card created"))
    }
    def destroy = {
    }
}
