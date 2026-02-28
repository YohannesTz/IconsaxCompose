package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.4f, y = 12.95f)
                lineToRelative(dx = -4.52f, dy = 2.26f)
                lineToRelative(dx = -3.19f, dy = -3.19f)
                lineToRelative(dx = 3.22f, dy = -3.22f)
                lineToRelative(dx = 4.49f, dy = 2.25f)
                arcToRelative(a = 1.06f, b = 1.06f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 9.06f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = 0.83f, dy2 = -1.3f, dx3 = 1.55f, dy3 = -0.95f)
                lineTo(x = 16.92f, y = 8.8f)
                lineToRelative(dx = -3.22f, dy = 3.22f)
                lineToRelative(dx = -9.58f, dy = 9.58f)
                lineToRelative(dx = -0.58f, dy = 0.29f)
                arcTo(horizontalEllipseRadius = 1.07f, verticalEllipseRadius = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 20.93f)
                verticalLineToRelative(dy = -7.36f)
                moveToRelative(dx = 14.89f, dy = 1.64f)
                lineTo(x = 4.12f, y = 21.6f)
                lineToRelative(dx = 9.58f, dy = -9.58f)
                close()
                moveToRelative(dx = -3.19f, dy = -3.19f)
                lineTo(x = 4.09f, y = 2.41f)
                moveToRelative(dx = 12.83f, dy = 12.83f)
                lineToRelative(dx = -0.03f, dy = -0.03f)
            }
        }.build().also { _googlePlay = it }
    }

@Suppress("ObjectPropertyName")
private var _googlePlay: ImageVector? = null
