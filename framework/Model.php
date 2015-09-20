<?php
    /**
    * class Model
    */
    class Model {

        protected $db;
        
        public function __construct() {
            $this->db = new PDO('mysql:host=localhost;dbname=matelibrary', 'root', 'root');
            // define para que o PDO lance exceções caso ocorra erros
            $this->db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        }

        public function create( $table, array $data) {

            foreach ($data as $idx => $vals) {
                $fields[] = $idx;
                $values[] = $vals;
            }

            $fields = implode(", ", $fields);
            $values = "'". implode("', '", $values)."'";
            try {
                $sql = "INSERT INTO `{$table}` ({$fields}) VALUES ({$values})";
                $this->db->query($sql);

            } catch (PDOException $e) {
                return "some fail-messages";
            }

        }

        public function read() {}

        public function update() {}

        public function delete() {}
    }