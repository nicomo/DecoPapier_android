
  // manages popover contents
  function popify() {
    $('.pop').append('&nbsp;<i class="icon-eye-open"></i>');
    var poped = false;
      $('.pop').on({'touchend': function() {
      $('.ptr').css('opacity', 0);
      if (! poped) {
        poped = true;
        $('body').append('<div class="overlay"></div>');
        $('.overlay').append($(this).attr('data-content'));
        $('.overlay>*').append('<button class="close"></button>');
        $('.overlay>*').css('margin-left', - $('.overlay>*').outerWidth()/2);
        $('.overlay>*').css('margin-top', - $('.overlay>*').outerHeight()/2);
        $('*').on({'touchstart' : function(){
          $('.overlay').remove();
          poped = false;
        }});
      }
    }});
  }

  $( document ).ready(function() {
    alert("foo");
    $(".slideshow").slideshow();
    popify();
  });
