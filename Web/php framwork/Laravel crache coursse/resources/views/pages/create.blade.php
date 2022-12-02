@extends('layouts.app')
@section('title')
 Create
@endsection
@section("content")
<div class="jumbotron">
    <h2>Add Product Page</h2>
    <form action="{{url('/savedProducts')}}" method="POST">
        {{ csrf_field() }}
        <div class="form-group">
          <label for="exampleInputEmail1">Product name:</label>
          <input type="text" class="form-control" name="product_name" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Product name">
        </div>
        <div class="form-group">
          <label for="exampleInputPassword1">Product price:</label>
          <input type="text" class="form-control" name="product_price" id="exampleInputPassword1" placeholder="Product price">
        </div>
        <div class="form-group">
            <label for="exampleFormControlTextarea1">Product desc:</label>
            <textarea class="form-control" id="exampleFormControlTextarea1" name="product_description" rows="3"></textarea>
          </div>
        <button type="submit" class="btn btn-primary">add product</button>
      </form>
</div>
@endsection
