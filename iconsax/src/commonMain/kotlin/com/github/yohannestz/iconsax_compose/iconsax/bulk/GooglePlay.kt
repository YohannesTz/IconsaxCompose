package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GooglePlay: ImageVector
    get() {
        val current = _googlePlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.GooglePlay",
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
                moveTo(x = 21.4f, y = 12.95f)
                lineToRelative(dx = -4.51f, dy = 2.26f)
                lineToRelative(dx = -3.19f, dy = -3.19f)
                lineToRelative(dx = 3.22f, dy = -3.22f)
                lineToRelative(dx = 4.48f, dy = 2.25f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.92f, y = 8.8f)
                lineToRelative(dx = -3.22f, dy = 3.22f)
                lineToRelative(dx = -9.67f, dy = -9.67f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 13.7f, y = 12.02f)
                lineTo(x = 4.12f, y = 21.6f)
                lineToRelative(dx = -0.57f, dy = 0.29f)
                arcTo(horizontalEllipseRadius = 1.07f, verticalEllipseRadius = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 20.93f)
                verticalLineTo(y = 3.07f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = 0.83f, dy2 = -1.31f, dx3 = 1.55f, dy3 = -0.96f)
                lineToRelative(dx = 0.48f, dy = 0.24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.89f, y = 15.21f)
                lineTo(x = 4.12f, y = 21.6f)
                lineToRelative(dx = 9.58f, dy = -9.58f)
                close()
            }
        }.build().also { _googlePlay = it }
    }

@Suppress("ObjectPropertyName")
private var _googlePlay: ImageVector? = null
