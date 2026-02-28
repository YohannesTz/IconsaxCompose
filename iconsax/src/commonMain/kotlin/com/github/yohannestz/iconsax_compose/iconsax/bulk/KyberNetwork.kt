package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KyberNetwork: ImageVector
    get() {
        val current = _kyberNetwork
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.KyberNetwork",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f,
            ) {
                moveTo(x = 19.0f, y = 7.16f)
                verticalLineToRelative(dy = 8.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = 1.18f)
                lineToRelative(dx = -0.46f, dy = -0.24f)
                lineToRelative(dx = -8.16f, dy = -4.9f)
                lineToRelative(dx = 8.54f, dy = -4.75f)
                lineToRelative(dx = 0.45f, dy = -0.23f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.99f, y = 7.03f)
                lineToRelative(dx = -0.45f, dy = 0.23f)
                lineTo(x = 10.0f, y = 12.0f)
                lineToRelative(dx = 2.0f, dy = -9.0f)
                lineToRelative(dx = 0.14f, dy = -0.68f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.85f, dy1 = 0.25f)
                lineToRelative(dx = 5.0f, dy = 2.85f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.61f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 3.0f)
                lineToRelative(dx = -2.0f, dy = 9.0f)
                lineToRelative(dx = 1.85f, dy = 9.23f)
                lineToRelative(dx = 0.05f, dy = 0.3f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = -0.36f)
                lineToRelative(dx = -5.0f, dy = -3.57f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 15.97f)
                verticalLineToRelative(dy = -8.8f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = -1.75f)
                lineToRelative(dx = 5.0f, dy = -2.85f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.13f, dy1 = -0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.62f, y = 17.15f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.46f, dy1 = 0.45f)
                lineToRelative(dx = -5.0f, dy = 3.57f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.26f, dy1 = 0.36f)
                lineToRelative(dx = -0.05f, dy = -0.3f)
                lineTo(x = 10.0f, y = 12.0f)
                lineToRelative(dx = 8.16f, dy = 4.91f)
                close()
            }
        }.build().also { _kyberNetwork = it }
    }

@Suppress("ObjectPropertyName")
private var _kyberNetwork: ImageVector? = null
