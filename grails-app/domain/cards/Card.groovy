package cards

import grails.rest.*

@Resource
class Card {
	String title
	Date dateCreated
	Date lastUpdated

    static constraints = {
    	title blank:false
    }
}
