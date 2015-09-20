<?php
    /**
    * class Model
    */
    class Model {

        protected $db;
        
        public function __construct() {
            $this->db = new PDO('mysql:host=localhost;dbname=matelibrary', 'root', 'root');
        }

        public function create( $table, array $data) {
            $sql = "INSERT INTO";

            foreach ($data as $idx => $vals) {
                $fields[] = $idx;
                $values[] = $vals;
            }

            $fields = implode(', ', $fields);
            $values = implode(', ', $values);
        }

        public function read() {}

        public function update() {}

        public function delete() {}
    }