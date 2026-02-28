package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToggleOn: ImageVector
    get() {
        val current = _toggleOn
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ToggleOn",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 7.35f, y = 3.86f)
                horizontalLineToRelative(dx = 9.3f)
                curveToRelative(dx1 = 4.1f, dy1 = 0.0f, dx2 = 5.35f, dy2 = 1.25f, dx3 = 5.35f, dy3 = 5.35f)
                verticalLineToRelative(dy = 5.58f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.1f, dx2 = -1.25f, dy2 = 5.35f, dx3 = -5.35f, dy3 = 5.35f)
                horizontalLineToRelative(dx = -9.3f)
                curveToRelative(dx1 = -4.1f, dy1 = 0.0f, dx2 = -5.35f, dy2 = -1.25f, dx3 = -5.35f, dy3 = -5.35f)
                verticalLineTo(y = 9.21f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.1f, dx2 = 1.25f, dy2 = -5.35f, dx3 = 5.35f, dy3 = -5.35f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.21f, y = 7.58f)
                horizontalLineToRelative(dx = 2.23f)
                curveToRelative(dx1 = 2.25f, dy1 = 0.0f, dx2 = 3.3f, dy2 = 1.05f, dx3 = 3.3f, dy3 = 3.3f)
                verticalLineToRelative(dy = 2.23f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.25f, dx2 = -1.05f, dy2 = 3.3f, dx3 = -3.3f, dy3 = 3.3f)
                horizontalLineToRelative(dx = -2.23f)
                curveToRelative(dx1 = -2.25f, dy1 = 0.0f, dx2 = -3.3f, dy2 = -1.05f, dx3 = -3.3f, dy3 = -3.3f)
                verticalLineToRelative(dy = -2.23f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.25f, dx2 = 1.05f, dy2 = -3.3f, dx3 = 3.3f, dy3 = -3.3f)
            }
        }.build().also { _toggleOn = it }
    }

@Suppress("ObjectPropertyName")
private var _toggleOn: ImageVector? = null
