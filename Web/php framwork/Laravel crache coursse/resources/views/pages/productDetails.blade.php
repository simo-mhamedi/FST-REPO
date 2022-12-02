@extends('layouts.app')
@section('title')
 Product details
@endsection
@section("content")
<div class="jumbotron">
    <h2> Product details Page</h2>
    <div class="well">
            <h2>{{$product->product_name}}</h2>
            <h3>Price: {{$product->product_price}}DH</h3>
            <h3>Desc:{{$product->product_description}}</h3>
    </div>
</div>
@endsection
