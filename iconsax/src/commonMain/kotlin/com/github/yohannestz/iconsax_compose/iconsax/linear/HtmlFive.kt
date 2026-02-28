package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HtmlFive: ImageVector
    get() {
        val current = _htmlFive
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HtmlFive",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.1f, y = 2.0f)
                horizontalLineToRelative(dx = 15.8f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.0f, dx2 = 1.1f, dy2 = 0.5f, dx3 = 1.0f, dy3 = 1.1f)
                lineToRelative(dx = -1.8f, dy = 16.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.3f, dy2 = 0.7f, dx3 = -0.7f, dy3 = 0.9f)
                lineToRelative(dx = -6.1f, dy = 1.7f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.1f, dx2 = -0.4f, dy2 = 0.1f, dx3 = -0.5f, dy3 = 0.0f)
                lineToRelative(dx = -6.1f, dy = -1.7f)
                arcTo(horizontalEllipseRadius = 0.9f, verticalEllipseRadius = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 19.3f)
                lineTo(x = 3.1f, y = 3.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.6f, dx2 = 0.4f, dy2 = -1.1f, dx3 = 1.0f, dy3 = -1.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.2f, y = 6.8f)
                horizontalLineTo(x = 7.8f)
                lineToRelative(dx = 0.4f, dy = 4.4f)
                horizontalLineToRelative(dx = 7.6f)
                lineToRelative(dx = -0.6f, dy = 5.0f)
                lineToRelative(dx = -3.4f, dy = 1.0f)
                lineToRelative(dx = -3.6f, dy = -1.0f)
                verticalLineToRelative(dy = -2.0f)
            }
        }.build().also { _htmlFive = it }
    }

@Suppress("ObjectPropertyName")
private var _htmlFive: ImageVector? = null
