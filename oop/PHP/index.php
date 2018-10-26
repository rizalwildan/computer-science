<?php 

require_once 'asimo.php';
require_once 'robot.php';

$asimo = new RobotAsimo('Ulalala', 40, 'semi-human');
echo $asimo->getVoice().'<br>';
echo $asimo->abilities().'<br>';
echo $asimo->getWeight().'<br>';
echo $asimo->getType();
