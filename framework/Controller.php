<?php

    /**
    * class Controller
    */
   class Controller
    {
        protected function view($controller, $view) {
            return require_once('app/views/scripts/'.strtolower($controller).'/'.$view.'.phtml');
        }
    }