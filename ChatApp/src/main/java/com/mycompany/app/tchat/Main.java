package com.mycompany.app.tchat;


import picocli.CommandLine;
import picocli.CommandLine.*;

@Command(name="TChat",version="TChat 1.0",mixinStandardHelpOptions = true)
public class Main implements Runnable{

	@Option(names = { "-b" },description = "Set boolean")
	boolean isAlive = false;

	public static void main(String[] args) {

		int exitCode = new CommandLine(new Main()).execute(args);

		System.exit(exitCode);
	}

	@Override
	public void run() {

	}
}
