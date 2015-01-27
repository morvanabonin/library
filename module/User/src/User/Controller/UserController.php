<?php
/**
 * Created by PhpStorm.
 * User: Morvana Bonin
 * Date: 25/01/2015
 * Time: 21:14
 */

namespace User\Controller;

use Zend\Mvc\Controller\AbstractActionController;
use Zend\View\Model\ViewModel;

class UserController extends AbstractActionController
{
    public function indexAction() {
        return new ViewModel();

    }

    public function addAction()
    {
    }

    public function editAction()
    {
    }

    public function deleteAction()
    {
    }
}