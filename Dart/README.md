#3 DART
# Basic Deep learning Tutroials Points of Dart
Dart is an open-source general-purpose programming language. It is originally developed by Google and later approved as a standard by ECMA. Dart is a new programming language meant for the server as well as the browser. Introduced by Google, the Dart SDK ships with its compiler –- the Dart VM. The SDK also includes a utility -dart2js, a transpiler that generates JavaScript equivalent of a Dart Script. This tutorial provides a basic level understanding of the Dart programming language.

Dart is the client-optimized language for developing fast apps on any platform. Its goal is to offer the most productive programming language for multi-platform development, Paired with a flexible execution runtime platform for app frameworks.

Languages are defined by their technical envelope—the choices made during development that shape the capabilities and strengths of a language. Dart is designed for a technical envelope that is particularly suited to client development, prioritizing both development (sub-second stateful hot reload) and high-quality production experiences across a wide variety of compilation targets (web, mobile, and desktop).

Dart also forms the foundation of Flutter. Dart provides the language and runtimes that power Flutter apps, but Dart also supports many core developer tasks like formatting, analyzing, and testing code.

Dart offers sound null safety, meaning that values can’t be null unless you say they can be. With sound null safety, Dart can protect you from null exceptions at runtime through static code analysis. Unlike many other null-safe languages, when Dart determines that a variable is non-nullable, that variable is always non-nullable. If you inspect your running code in the debugger, you’ll see that non-nullability is retained at runtime (hence sound null safety).

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
Dart is an open-source general-purpose programming language. It is originally developed by Google and later approved as a standard by ECMA. Dart is a new programming language meant for the server as well as the browser. Introduced by Google, the Dart SDK ships with its compiler – the Dart VM. The SDK also includes a utility -dart2js, a transpiler that generates JavaScript equivalent of a Dart Script. This tutorial provides a basic level understanding of the Dart programming language.
characters
-intl
-http
-crypto
-markdown
Windows integration
SQLite
compression
To see a series of working examples featuring the Dart core libraries, take the library tour. To find additional APIs, see the commonly used packages page.
Dart: The platforms
Dart’s compiler technology lets you run code in different ways:
Native platform: For apps targeting mobile and desktop devices, Dart includes both a Dart VM with just-in-time (JIT) compilation and an ahead-of-time (AOT) compiler for producing machine code.
Web platform: For apps targeting the web, Dart can compile for development or production purposes. Its web compiler translates Dart into JavaScript.
An illustration of the targets supported by Dart
The Flutter framework is a popular, multi-platform UI toolkit that’s powered by the Dart platform, and that provides tooling and UI libraries to build UI experiences that run on iOS, Android, macOS, Windows, Linux, and the web.
