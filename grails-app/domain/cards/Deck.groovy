package cards

import grails.rest.*

@Resource
class Deck {
	String title
	static hasMany = [cards: Card]
	Date dateCreated
	Date lastUpdated

    static constraints = {
    	title blank:false
    }
}
