package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlashCircle: ImageVector
    get() {
        val current = _flashCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FlashCircle",
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
                moveTo(x = 11.97f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.25f, y = 11.3f)
                horizontalLineToRelative(dx = -1.7f)
                verticalLineTo(y = 7.34f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.92f, dx2 = -0.5f, dy2 = -1.11f, dx3 = -1.11f, dy3 = -0.42f)
                lineTo(x = 12.0f, y = 7.42f)
                lineToRelative(dx = -3.72f, dy = 4.23f)
                curveToRelative(dx1 = -0.51f, dy1 = 0.58f, dx2 = -0.3f, dy2 = 1.05f, dx3 = 0.47f, dy3 = 1.05f)
                horizontalLineToRelative(dx = 1.7f)
                verticalLineToRelative(dy = 3.96f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.92f, dx2 = 0.5f, dy2 = 1.11f, dx3 = 1.11f, dy3 = 0.42f)
                lineToRelative(dx = 0.44f, dy = -0.5f)
                lineToRelative(dx = 3.72f, dy = -4.23f)
                curveToRelative(dx1 = 0.51f, dy1 = -0.58f, dx2 = 0.3f, dy2 = -1.05f, dx3 = -0.47f, dy3 = -1.05f)
            }
        }.build().also { _flashCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _flashCircle: ImageVector? = null
