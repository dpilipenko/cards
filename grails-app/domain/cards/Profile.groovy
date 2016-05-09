package cards

import grails.rest.*

@Resource
class Profile {
	String username
	static hasMany = [decks: Deck]
	Date dateCreated
	Date lastUpdated

    static constraints = {
    	username blank:false
    }
}
