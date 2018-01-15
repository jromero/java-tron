/*
 * java-tron is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * java-tron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.tron.core;


import java.math.BigInteger;
import java.util.Map;
import org.tron.protos.core.TronBlock;

public class BlockSummary {

  private final TronBlock.Block block;
  private final Map<byte[], BigInteger> rewards;
  private BigInteger totalDifficulty = BigInteger.ZERO;

  public BlockSummary(TronBlock.Block block, Map<byte[], BigInteger> rewards) {
    this.block = block;
    this.rewards = rewards;
  }

  public void setTotalDifficulty(BigInteger totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }
}
