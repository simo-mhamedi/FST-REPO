@extends('layouts.app')
@section('title')
 services
@endsection
@section("content")
<div class="jumbotron">
    <h2>Services Page</h2>
    @foreach ($products as $p )
    <div class="well">
            <h2><a href="productDetails/{{$p->id}}"> {{$p->product_name}}</a></h2>
    </div>
    @endforeach
    {{$products->links()}}
</div>
@endsection
