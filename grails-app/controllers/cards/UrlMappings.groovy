package cards

class UrlMappings {

    static mappings = {

        group "/api", {
            "/cards"(resources:"card", includes:['index', 'save', 'show', 'update'])
            "/decks"(resources:"deck", includes:['index', 'save', 'show', 'update'])
            "/profiles"(resources:"profile", includes:['index', 'save', 'show', 'update'])
        }
        
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
