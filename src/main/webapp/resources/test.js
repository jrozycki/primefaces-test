/* Place any Javascript here you want loaded in test.xhtml */


          function selectAllForTest1(divClass)
          {
  			// This snippet sets the radio as selected
			// internally but does not get visibly selected
        	  var divs = document.getElementsByClassName(divClass);
        	    	for (const div of divs) {
        	    		$(div).find('input:radio:first').each(function() {
        	       			radio = $(this).attr('id').replaceAll(':','\\:').replace('_clone','');
        	                console.log("radio " + radio);
        	    			$('#'+radio+':last').prop('checked', true).change();
        	    			$('#'+radio+':last').attr('checked', true);
        	    		});
          }

          }
          
          
          function selectAllForTest3(){
          	
  			  var radio_button = jQuery("input:radio")
    		  	console.log("radio_button " + $(radio_button).attr('name'));
    			for (var i = 0; i  < radio_button.length; i+=4) {
    				// i+=1 visually selects them all, submitted value is
					// NO_MINOR
    				// i+=6 staggers
					// i+=4 visually selects YES, submitted value is NA
    				
                  console.log("Radio name attribute: " + $(radio_button[i]).attr('name'));
                  
    
                  $(radio_button[i].parentNode.parentNode.children[1]).addClass('ui-state-active');
                  $(radio_button[i].parentNode.parentNode.children[1]).children('span').addClass('ui-icon ui-icon-bullet');
                  $(radio_button[i]).attr('checked', true);
              }            	
        	
        };


        function selectAllForTest2(){
        	
            $('div[id*="na"] > div').each(function() {
                $(this).addClass('ui-state-active');
                $(this).children('span').addClass('ui-icon-check');
                $(this).children('span').removeClass('ui-icon-blank');
            });          	
      };


       

    function otherTriedCode(divClass)
    {
// console.log("start");
  
    	$(':checkbox[id*="cloneCheckBox"]').attr('checked', checked);
// $('#assignmentForm\\:ynnrCheckListId\\:0\\:yesNoNA').prop('checked', true);
// $('\\:ynnrCheckListId\\:1\\:yesNoNA\\:4_clone').last().prop('checked', true);
// $('[id="#assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA\\:4_clone"]:last').prop('checked',
// true);
// $('[id="#assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA\\:4"]:last').prop('checked',
// true);
// $('[id="#assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA"]:last').prop('checked',
// true);
// $('[id="#assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA\\:4"]').prop('checked',
// true);
// $('#assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA\\:4').prop('checked',
// true);
// $('#assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA\\:4').prop('checked',
// true);
	  
// $('#assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA\\:4_clone:last').prop('checked',true);
// $('#assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA\\:4:last').prop('checked',true);
			 
// jQuery('input[name=assignmentForm\\:ynnrCheckListId\\:0\\:yesNoNA]:last').prop('checked',
// true);
// jQuery('input[name=assignmentForm\\:ynnrCheckListId\\:1\\:yesNoNA\\:4]:last').prop('checked',
// true);
// jQuery('input[name*="ynnrCheckListId"]:last').prop('checked', true);
  
  
// var radicos = jQuery("input:radio")
// console.log("radicos " + $(radicos).attr('name'));
// for (var i = 0; i < radicos.length; i++) {
//
// console.log("RRRRRRRRRRRR " + $(radicos[i]).attr('name'));
//                
// if( (radicos[i].id.indexOf('inputTipoLtg')) > -1 ){
// continue;
// }
//  
// $(radicos[i].parentNode.parentNode.children[1]).addClass('ui-state-active');
// console.log("YYYYYY " +
// $(radicos[i].parentNode.parentNode.children[1]).values);
//                 
// $(radicos[i].parentNode.parentNode.children[1]).children('span').addClass('ui-icon
// ui-icon-bullet');
// $(radicos[i]).attr('checked', true);
// }

                  			  
  		  			  
  var divs = document.getElementsByClassName(divClass);
  console.log ("=============DivClass = " + divClass);
  console.log ("=============Quantity = " + divs.length);

    	for (const div of divs) {
            console.log("div stuff" + $(div).attr('name'));
            console.log("div thin " + $(div).attr('id'));

// row = $(div).find('#' + row_id);
// console.log ("=============Row = " + row);
            
// var radiosBtns = div.find("input[type='radio']");
// var radiosBtns = jQuery("#assignmentForm\\:ynnrCheckListId\\:\\0\\:yesNoNA
// :radio")
// var radiosBtns = document.getElementsByName( divClass );
			  
			  var radiosBtns = $("#assignmentForm\\:ynnrCheckListId\\:\\0\\:yesNoNA");
// or
// var radiosBtns = $("[id='foo:bar']");
// or
// var radiosBtns = $(document.getElementById("foo:bar"));

			 var radiosBtns = jQuery("input:radio")

			for (var i = 0; i  < radiosBtns.length; i+=1) {
				// i+=1 visually selects them all, submitted value is NO_MINOR
				// i+=6 staggers
				// i+=4 visually selects YES, submitted value is NA
				
	              console.log("-=-=-=-==-=-=-=-=-=-=-Radio name attribute: " + $(radiosBtns[i]).attr('name'));
	              console.log("-=-=-=-==-=-=-=-=-=-=-Radio parentNode: " + JSON.stringify($(radiosBtns[i].parentNode)));
	              console.log("-=-=-=-==-=-=-=-=-=-=-Radio parentNode.parentNode: " + JSON.stringify($(radiosBtns[i].parentNode.parentNode)));
	              console.log("-=-=-=-==-=-=-=-=-=-=-Radio parentNode.parentNode.children: " + JSON.stringify($(radiosBtns[i].parentNode.parentNode.children[1])));
// assignmentForm:ynnrCheckListId:15:yesNoNA
// assignmentForm\:ynnrCheckListId\:0\:yesNoNA\:4

// $(radiosBtns[i].parentNode.parentNode.children[1]).addClass('ui-state-active');
// $(radiosBtns[i].parentNode.parentNode.children[1]).children('span').addClass('ui-icon
// ui-icon-bullet');
// $(radiosBtns[i]).attr('checked', true);
          }            	

    		
            console.log("div " + $(div).attr('name'));
            

    		$(div).find('input:radio:first').each(function() {
    			
// newname_inp =
// $(this).attr('id').replaceAll(':','\\:').replace('_clone',':last');
// newname = $(this).attr('id').replaceAll(':','\\:').replace('_clone',':last');
// newname2 = $(this).attr('id').replaceAll(':','\\:')+':last';
//
//
    			
    			// This snippet sets the radio as selected internally but not as
				// visibly selected
       			newname3 = $(this).attr('id').replaceAll(':','\\:').replace('_clone','');
                console.log("newname3 " + newname3);
    			$('#'+newname3+':last').prop('checked', true).change();
    			$('#'+newname3+':last').attr('checked', true);
    			// above works to record but not show as checked
    			
    			radiosBtns[i] = newname3;
                $(radiosBtns[i]).addClass('ui-state-active');
                $(radiosBtns[i]).children('span').addClass('ui-icon ui-icon-bullet');
                $(radiosBtns[i]).attr('checked', true);

    			
    			
//
    			
// newname2 = $(newname).replaceAll('_clone',':last');
// console.log("id " + $(this).attr('id') );
// console.log("newname " + newname);
// console.log("newname2 " + newname2);
// $('#'+newname).prop('checked', true).change();
// $('#'+newname2).prop('checked', true).change();

                 
// $('#'+newname).trigger('click');
// $('#'+newname).trigger('change');
// $(this).prop('checked', true).change();
// $(this).prop("checked", true).trigger('click');
// $(this).prop('checked', true).change();

// jQuery('input[name=yesNoNA]:last').prop('checked', true);

        		
// $(this).prop('checked', true);
    			
                console.log("id " + $(this).attr('id') );
                console.log("nm " + $(this).attr('name') );
                console.log("radio value " + $(this).val());
                console.log("is radio checked? " + $(this).prop('checked'));

 // $(this).prop('checked', true);
 // $(this).addClass('ui-state-active');
 // $(this).children('span').addClass('ui-icon ui-icon-check');
                
 // console.log("Now is radio checked? " + $(this).prop('checked'));
 // $(this).trigger('click');
// $(this).trigger('change');

                console.log("");

    		});

  		

        	}

   }