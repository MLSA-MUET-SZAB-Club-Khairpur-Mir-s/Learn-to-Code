#3 DART
# deep learning Basic Points of Dart
Dart is an open-source general-purpose programming language. It is originally developed by Google and later approved as a standard by ECMA. Dart is a new programming language meant for the server as well as the browser. Introduced by Google, the Dart SDK ships with its compiler –- the Dart VM. The SDK also includes a utility -dart2js, a transpiler that generates JavaScript equivalent of a Dart Script. This tutorial provides a basic level understanding of the Dart programming language.

Dart is the client-optimized language for developing fast apps on any platform. Its goal is to offer the most productive programming language for multi-platform development, Paired with a flexible execution runtime platform for app frameworks.

The following code sample showcases several Dart language features, including libraries, async calls, nullable and non-nullable types, arrow syntax, generators, streams, and getters. To find examples of using additional Dart features, see the samples page. To learn more about the language, take the Dart language tour.

Dart has a rich set of core libraries, providing essentials for many everyday programming tasks:
Built-in types, collections, and other core functionality for every Dart program (dart:core)
Richer collection types such as queues, linked lists, hashmaps, and binary trees (dart:collection)
Encoders and decoders for converting between different data representations, including JSON and UTF-8 (dart:convert)
Mathematical constants and functions, and random number generation (dart:math)
File, socket, HTTP, and other I/O support for non-web applications (dart:io)
Support for asynchronous programming, with classes such as Future and Stream (dart:async)
Lists that efficiently handle fixed-sized data (for example, unsigned 8-byte integers) and SIMD numeric types (dart:typed_data)
Foreign function interfaces for interoperability with other code that presents a C-style interface (dart:ffi)
Concurrent programming using isolates—independent workers that are similar to threads but don’t share memory, communicating only through messages (dart:isolate)
HTML elements and other resources for web-based applications that need to interact with the browser and the Document Object Model (DOM) (dart:html)
Beyond the core libraries, many APIs are provided through a comprehensive set of packages. The Dart team publishes many useful supplementary packages, such as these:
-intl
-http
-crypto
-markdown
Additionally, third-party publishers and the broader community publish thousands of packages, with support for features like these:
XML
Dart’s compiler technology lets you run code in different ways:
Native platform: For apps targeting mobile and desktop devices, Dart includes both a Dart VM with just-in-time (JIT) compilation and an ahead-of-time (AOT) compiler for producing machine code.
