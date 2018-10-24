<?php

// class
class Robot
{
    // property
    public $voice;
    public $weight;

    /* 
    Protected Property 
    this property can't access directly 
    but can access by child class
    */
    protected $type;

    // Konstruktor
    public function __construct($voice, $weight, $type) {
        $this->voice = $voice;
        $this->weight = $weight;
        $this->type = $type;
    }

    // metode set & get
    public function setVoice($voice) {
        $this->voice = $voice;
    }

    public function getVoice() {
        echo "this voice ".$this->voice;
    }

    public function setWeight($weight) {
        $this->weight = $weight;
    }

    public function getWeight() {
        return $this->weight;
    }

    public function setType($type) {
        $this->type = $type;
    }

    public function getType() {
        return $this->type;
    }
}