<?php
require_once 'robot.php';

// Inheritance from parent class Robot 
class RobotAsimo extends Robot
{
    public function abilities() {
        echo 'my abilities: serving people';
    }

    // overiding method parent class
    public function getVoice()
    {
        echo 'my default voice.... '.$this->voice;
    }

    public function getWeight()
    {
        echo 'my weight: '.$this->weight;
    }

    public function setType($type)
    {
        $this->type = $type;   
    }

    public function getType()
    {
        echo "i'm type: ".$this->type;
    }
}