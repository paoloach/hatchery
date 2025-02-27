package edu.umontreal.hatchery.cli

import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.configurations.GeneralCommandLine.ParentEnvironmentType.SYSTEM
import com.intellij.execution.filters.TextConsoleBuilderFactory
import com.intellij.execution.process.ColoredProcessHandler
import com.intellij.execution.process.KillableColoredProcessHandler
import com.intellij.execution.process.ProcessTerminatedListener
import com.intellij.execution.runners.ExecutionEnvironment
import edu.umontreal.hatchery.settings.RosConfig

class RosCommandLineState : CommandLineState {
  private val commandLine: GeneralCommandLine

  constructor(env: ExecutionEnvironment, vararg commands: String) : super(env) {
    commandLine = createCommandLine(*commands)
    consoleBuilder = TextConsoleBuilderFactory.getInstance().createBuilder(env.project)
  }

  private fun createCommandLine(vararg commands: String) =
    GeneralCommandLine(*commands)
      .withEnvironment(RosConfig.settings.localRos.env)
      .withParentEnvironmentType(SYSTEM)

  override fun startProcess() =
    KillableColoredProcessHandler(commandLine).apply { ProcessTerminatedListener.attach(this) }
}