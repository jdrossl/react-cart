def spec = [:]

spec.swagger = "2.0";

spec.info = [:]
  spec.info.description = "This is a API for Dazzel content"
  spec.info.version = "1.0.0"
  spec.info.title = "Dazzel API"
  spec.info.termsOfService = "http://dazzel.org/terms/"
  spec.info.contact = [:]  
    spec.info.contact.email = "apiteam@swagger.io"
  spec.info.license = [:]
    spec.info.license.name = "SOME LICENSE"
    spec.info.license.url = "http://dazzel.org/api/license"

  spec.host = "localhost:8080" 
  spec.basePath = "/apix/content"     
  spec.tags = []
  spec.schemes = ["http"]

  spec.paths = [:]
  	
       spec.paths["/foo"] = [:]

		def fooApi = spec.paths["/foo"]
        
    	fooApi.get = [:]
        	fooApi.get.tags = []
            fooApi.get.summary = "A Get Based API"
  			fooApi.get.operationId = "doTheFoo"
             fooApi.get.consumes = [ "application/json" ]
             fooApi.get.produces = [ "application/json" ]

			fooApi.get.parameters = []

			fooApi.get.responses = [:]
            	fooApi.get.responses["200"] = [:]
            		fooApi.get.responses["200"].description = "Foo :)"
                fooApi.get.responses["404"] = [:]
            		fooApi.get.responses["404"].description = "Not so Foo :("


    spec.paths["/article"] = [:]

		def articleApi = spec.paths["/article"]
        
    	articleApi.get = [:]
        	articleApi.get.tags = []
            articleApi.get.summary = "Get an article for a given ID"
  			articleApi.get.operationId = "getArticle"
             articleApi.get.consumes = [ "application/json" ]
             articleApi.get.produces = [ "application/json" ]

			articleApi.get.parameters = []
            	articleApi.get.parameters[0] = [:]
                	articleApi.get.parameters[0].in = "query"
                    articleApi.get.parameters[0].type = "string"
                    articleApi.get.parameters[0].name = "id"
                    articleApi.get.parameters[0].description = "An article ID"
                    articleApi.get.parameters[0].required = true

			articleApi.get.responses = [:]
            	articleApi.get.responses["200"] = [:]
            		articleApi.get.responses["200"].description = "An article object for the given ID"
                articleApi.get.responses["404"] = [:]
            		articleApi.get.responses["404"].description = "Article not found"

	spec.paths["/articles"] = [:]

		def articlesApi = spec.paths["/articles"]        
    	articlesApi.get = [:]
        	articlesApi.get.tags = []
            articlesApi.get.summary = "Get an articles for a topic"
  			articlesApi.get.operationId = "getArticles"
             articlesApi.get.consumes = [ "application/json" ]
             articlesApi.get.produces = [ "application/json" ]

			articlesApi.get.parameters = []
            	articlesApi.get.parameters[0] = [:]
                	articlesApi.get.parameters[0].in = "query"
                    articlesApi.get.parameters[0].type = "string"
                    articlesApi.get.parameters[0].name = "topic"
                    articlesApi.get.parameters[0].description = "An article TOPIC"
                    articlesApi.get.parameters[0].required = true

			articlesApi.get.responses = [:]
            	articlesApi.get.responses["200"] = [:]
            		articlesApi.get.responses["200"].description = "A list of article object for the given TOPIC"
                articlesApi.get.responses["404"] = [:]
            		articlesApi.get.responses["404"].description = "No articles not found"

return spec