package com.foo;

import java.util.stream.Stream;

public final class RunCukes
{
    private final static String[] defaultOptions = {
            "--glue", "com.foo",
            "--plugin", "pretty",
            "classpath:features"
    };

    /**
     * Main entry point for driving cucumber tests
     * @param args input command line arguments
     */
    public static void main(String[] args)
    {
        // Combine command line options with the static default options
        final Stream<String> options = Stream.concat(Stream.of(defaultOptions), Stream.of(args));

        // Run cucumber
        io.cucumber.core.cli.Main.main(options.toArray(String[]::new));
    }
}