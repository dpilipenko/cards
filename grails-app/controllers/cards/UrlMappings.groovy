package cards

class UrlMappings {

    static mappings = {
        "/public/"(controller:"public", action: "listProfiles")
        "/public/$profileID"(controller: "public", action: "getProfile")
        "/public/$profileID/decks"(controller: "public", action: "listDecksForProfile")
        "/public/$profileID/decks/$deckID"(controller: "public", action: "getDeck")
        "/public/$profileID/decks/$deckID/cards"(controller: "public", action: "listCardsForDeck")
        "/public/$profileID/decks/$deckID/cards/$cardID"(controller: "public", action: "getCard")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
