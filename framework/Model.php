<?php
    /**
    * class Model
    */
    abstract class Model {

        protected $db;
        
        public function __construct() {
            $this->db = new PDO();
        }
    }