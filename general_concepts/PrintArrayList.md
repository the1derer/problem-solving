// collect() method returns the result of the
        // intermediate operations performed on the stream
        String str = geeklist.stream().collect(
            Collectors.joining(","));
 
        // Printing the comma separated string
        System.out.println(str);


//--------------------

// Note: String.join() is used with a delimiter
        // comma along with the list
        String str = String.join(",", geeklist);
 
        // Printing the comma separated string
        System.out.println(str);

//--------list that is not of string type---------------

String output = L.stream().map(i -> i.toString()).collect(Collectors.joining(" "));