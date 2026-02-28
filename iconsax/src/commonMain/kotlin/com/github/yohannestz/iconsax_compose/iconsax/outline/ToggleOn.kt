package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 15.7f, y = 16.75f)
                horizontalLineToRelative(dx = -2.4f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.55f, dy2 = -1.13f, dx3 = -3.55f, dy3 = -3.55f)
                verticalLineToRelative(dy = -2.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 1.13f, dy2 = -3.55f, dx3 = 3.55f, dy3 = -3.55f)
                horizontalLineToRelative(dx = 2.4f)
                curveToRelative(dx1 = 2.42f, dy1 = 0.0f, dx2 = 3.55f, dy2 = 1.13f, dx3 = 3.55f, dy3 = 3.55f)
                verticalLineToRelative(dy = 2.4f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = -1.13f, dy2 = 3.55f, dx3 = -3.55f, dy3 = 3.55f)
                moveToRelative(dx = -2.4f, dy = -8.0f)
                curveToRelative(dx1 = -1.59f, dy1 = 0.0f, dx2 = -2.05f, dy2 = 0.46f, dx3 = -2.05f, dy3 = 2.05f)
                verticalLineToRelative(dy = 2.4f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.59f, dx2 = 0.46f, dy2 = 2.05f, dx3 = 2.05f, dy3 = 2.05f)
                horizontalLineToRelative(dx = 2.4f)
                curveToRelative(dx1 = 1.59f, dy1 = 0.0f, dx2 = 2.05f, dy2 = -0.46f, dx3 = 2.05f, dy3 = -2.05f)
                verticalLineToRelative(dy = -2.4f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.59f, dx2 = -0.46f, dy2 = -2.05f, dx3 = -2.05f, dy3 = -2.05f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 20.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.41f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -1.34f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.41f, dx2 = 1.34f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 4.41f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 1.34f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.41f, dx2 = -1.34f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -10.0f, dy = -16.0f)
                curveTo(x1 = 3.42f, y1 = 4.75f, x2 = 2.75f, y2 = 5.43f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.57f, dx2 = 0.67f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -0.68f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.57f, dx2 = -0.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                close()
            }
        }.build().also { _toggleOn = it }
    }

@Suppress("ObjectPropertyName")
private var _toggleOn: ImageVector? = null
