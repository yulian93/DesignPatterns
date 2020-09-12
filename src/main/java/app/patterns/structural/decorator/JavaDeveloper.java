package app.patterns.structural.decorator;

public class JavaDeveloper implements Developer{

  @Override
  public String makeJob() {
    return "Write code.\n";
  }
}
