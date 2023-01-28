/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(1)
 */
function interpret(command: string): string {
  command = command.replace(/\(\)/g, "o");
  command = command.replace(/\(/g, "");
  command = command.replace(/\)/g, "");
  return command;
}
