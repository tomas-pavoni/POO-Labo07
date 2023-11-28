package calculator;

abstract class Operator
{
  static State state;

  abstract void execute();
}
