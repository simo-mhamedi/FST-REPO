<?php
try{
$pdo=new PDO("mysql:host=localhost;dbname=my_contact","root","");
$pdo ->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);

echo "connected";
$pdo->getAttribute(constant("PDO::ATTR_CONNECTION_STATUS"));

}
catch(PDOException $e)
{
    die ("error:could not connected". $e->getMessage());
}
$conn = null;
?>