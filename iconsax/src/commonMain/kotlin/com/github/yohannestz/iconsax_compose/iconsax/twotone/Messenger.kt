package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Messenger: ImageVector
    get() {
        val current = _messenger
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Messenger",
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
                moveTo(x = 5.68f, y = 18.44f)
                verticalLineTo(y = 22.0f)
                lineToRelative(dx = 3.36f, dy = -1.89f)
                arcTo(horizontalEllipseRadius = 11.0f, verticalEllipseRadius = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 20.52f)
                curveToRelative(dx1 = 5.52f, dy1 = 0.0f, dx2 = 10.0f, dy2 = -4.15f, dx3 = 10.0f, dy3 = -9.26f)
                reflectiveCurveTo(x1 = 17.52f, y1 = 2.0f, x2 = 12.0f, y2 = 2.0f)
                reflectiveCurveTo(x1 = 2.0f, y1 = 6.15f, x2 = 2.0f, y2 = 11.26f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.68f, dy1 = 7.18f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.28f, y = 9.25f)
                lineToRelative(dx = -3.78f, dy = 4.5f)
                lineToRelative(dx = 3.69f, dy = -0.9f)
                lineToRelative(dx = 1.55f, dy = 0.9f)
                lineToRelative(dx = 3.76f, dy = -4.5f)
                lineToRelative(dx = -3.51f, dy = 0.9f)
                close()
            }
        }.build().also { _messenger = it }
    }

@Suppress("ObjectPropertyName")
private var _messenger: ImageVector? = null
