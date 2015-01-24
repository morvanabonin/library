<?php
/**
 * Created by PhpStorm.
 * User: Morvana Bonin
 * Date: 23/01/2015
 * Time: 21:42
 */

namespace User\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * @Entity @Table(name="user")
 **/
class User {
    /**
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     * @ORM\Column(type="integer")
     */
    protected $id;

    /** @Column(type="string") **/
    protected $name;

    protected $password;

    protected $email;

    protected $address;

    protected $age;

    protected $sexo;

    protected $created;
}