package me.him188.ani.app.ui.settings.framework.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * 一个 [TextButton] 在最右侧
 */
@SettingsDsl
@Composable
fun SettingsScope.TextButtonItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    title: @Composable () -> Unit,
) {
    Item(
        modifier.clickable(onClick = onClick),
        action = {
            TextButton(onClick, enabled = enabled) {
                title()
            }
        }
    ) {
    }
}

/**
 * 一行字作为按钮, 对齐在左边
 */
@SettingsDsl
@Composable
fun SettingsScope.RowButtonItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    description: @Composable (() -> Unit)? = null,
    icon: @Composable (() -> Unit)? = null,
    action: @Composable (() -> Unit)? = null,
    color: Color = MaterialTheme.colorScheme.primary,
    title: @Composable RowScope.() -> Unit,
) {
    TextItem(
        modifier = modifier,
        description = description,
        icon = icon?.let {
            @Composable {
                CompositionLocalProvider(LocalContentColor providesDefault color) {
                    icon()
                }
            }
        },
        action = action,
        onClick = onClick,
        onClickEnabled = enabled,
        title = {
            CompositionLocalProvider(LocalContentColor provides color) {
                title()
            }
        },
    )
}
