<?php
/**
 * Created by PhpStorm.
 * User: Morvana Bonin
 * Date: 23/01/2015
 * Time: 21:42
 */

namespace User\Entity;

use Doctrine\ORM\Mapping as ORM;
use ZendTest\XmlRpc\Server\Exception;

/**
 * @ORM\Entity
 * @ORM\Table(name="user")
 */
class User {

    /**
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     * @ORM\Column(type="integer")
     */
    protected $id;

    /**
     * @ORM\Column(type="string", length=255)
     */
    protected $name;

    /**
     * @ORM\Column(type="string", length=255)
     */
    protected $password;

    /**
     * @ORM\Column(type="string", length=255)
     */
    protected $email;

    /**
     * @ORM\Column(type="string", length=255, nullable=true)
     */
    protected $address;

    /**
     * @ORM\Column(type="int", nullable=true)
     */
    protected $age;

    /**
     * @ORM\Column(type="string", length=2)
     */
    protected $gender;

    /**
     * @ORM\Column(type="date")
     */
    protected $created;

    public function getId() {
        return $this->id;
    }

    public function getName() {
        return $this->name;
    }

    public function setName($name) {
        if(! is_string($name)) {
            throw new Exception('var $name should be a string');
        }

        if(empty($name)) {
            throw new Exception('var $name can not be empty');
        }
        $this->name = $name;
    }

    public function getPassword() {
    return $this->password;
}

    public function setPassword($password) {
        if(! is_string($password)) {
            throw new Exception('var $password should be a string');
        }

        if(empty($password)) {
            throw new Exception('var $password can not be empty');
        }
        $this->password = $password;
    }

    public function getEmail() {
        return $this->email;
    }

    public function setEmail($email) {
        if(! is_string($email)) {
            throw new Exception('var $email should be a string');
        }

        if(empty($email)) {
            throw new Exception('var $email can not be empty');
        }
        $this->email = $email;
    }

    public function getAddress() {
        return $this->address;
    }

    public function setAddress($address) {
        if(! is_string($address)) {
            throw new Exception('var $address should be a string');
        }

        $this->address = $address;
    }

    public function getAge() {
        return $this->age;
    }

    public function setAge($age) {
        if(! is_int($age)) {
            throw new Exception('var $age should be an integer');
        }

        $this->age = $age;
    }

    public function getGender() {
        return $this->gender;
    }

    public function setGender($gender) {
        if(! is_int($gender)) {
            throw new Exception('var $gender should be a string');
        }

        $this->gender = $gender;
    }
}