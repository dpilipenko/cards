import cards.*

class BootStrap {

    def init = { servletContext ->
    	Card c1 = new Card(title:"First Card").save()
    	Card c2 = new Card(title:"Second Card").save()
    	Deck d1 = new Deck(title:"Empty Deck").save()
    	Deck d2 = new Deck(title:"Filled Deck", cards:[c1, c2]).save()
    	Profile p1 = new Profile(username:"rabbit").save()
    	Profile p2 = new Profile(username:"duck", decks:[d2]).save()
    }
    def destroy = {
    }
}
