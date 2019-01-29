<!DOCTYPE html>
<html lang="en" class="gr__petstore_swagger_io">
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Crafter CMS</title>
  		<link href="/static-assets/app/swagger/css" rel="stylesheet">
  		<link rel="stylesheet" type="text/css" href="/static-assets/app/swagger/swagger-ui.css">
	</head>

	<body data-gr-c-s-loaded="true">
		<div id="swagger-ui">
		</div>

  		<style>
    	html {
	      box-sizing: border-box;
    	  overflow: -moz-scrollbars-vertical;
      	overflow-y: scroll;
    	}
    
    	*,
    	*:before,
    	*:after {
	      box-sizing: inherit;
    	}

		.info, .topbar .wrapper, #swagger-ui > section > div.wrapper > section > span {
            display: none;
        }
        .swagger-ui .topbar {
            background-color: red !important;
        }
	    body {
    	  margin:0;
      	  background: #fafafa;
    	}
        
  	</style>
  
	<script src="/static-assets/app/swagger/swagger-ui-bundle.js"> </script>
	<script src="/static-assets/app/swagger/swagger-ui-standalone-preset.js"> </script>

    <script>
        window.onload = function() {
      
      // Build a system
      const ui = SwaggerUIBundle({
        url: "/api/api-spec.json",
        dom_id: '#swagger-ui',
        deepLinking: true,
        presets: [
          SwaggerUIBundle.presets.apis,
          SwaggerUIStandalonePreset
        ],
        plugins: [
          SwaggerUIBundle.plugins.DownloadUrl
        ],
        layout: "StandaloneLayout"
      })
    
      window.ui = ui
    }
    </script>

        <div id="lo-engage-ext-container">
            <div data-reactroot=""></div>
        </div>

		<link rel="stylesheet" type="text/css" href="chrome-extension://liecbddmkiiihnedobmlmillhodjkdmb/css/content.css">
	</body>
</html>