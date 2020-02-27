package kafka.admin

import kafka.admin.ConsumerGroupCommand.ConsumerGroupCommandOptions
import kafka.utils.{CommandLineUtils, Logging}

object ConsumerGroupMemberCommnad extends Logging {

  def main(args: Array[String]): Unit = {

    val opts = new ConsumerGroupCommandOptions(args)

    CommandLineUtils.printHelpAndExitIfNeeded(opts, "will immediately trigger a consumer group rebalance by transiting group state to PREPARE_REBALANCE, while removing all the static members in the given list.")
  }

}
