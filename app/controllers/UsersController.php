<?php

/**
* Class of system user
*/
class Users extends Controller
{
    public function indexAction() {
        $this->view($this->_getClass(), 'index');
    }

    public function addAction() {
        
    }

    public function editAction() {

    }

    public function deleteAction() {

    }

    private function _getClass() {
        return get_class($this);
    }
}