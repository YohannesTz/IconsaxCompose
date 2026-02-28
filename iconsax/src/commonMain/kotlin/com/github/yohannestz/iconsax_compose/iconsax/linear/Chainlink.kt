package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Chainlink: ImageVector
    get() {
        val current = _chainlink
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Chainlink",
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
                moveTo(x = 3.0f, y = 8.2f)
                verticalLineToRelative(dy = 7.6f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.7f, dx2 = 0.4f, dy2 = 1.4f, dx3 = 1.0f, dy3 = 1.7f)
                lineToRelative(dx = 7.0f, dy = 3.9f)
                curveToRelative(dx1 = 0.6f, dy1 = 0.3f, dx2 = 1.3f, dy2 = 0.3f, dx3 = 1.9f, dy3 = 0.0f)
                lineToRelative(dx = 7.0f, dy = -3.9f)
                curveToRelative(dx1 = 0.6f, dy1 = -0.4f, dx2 = 1.0f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.7f)
                verticalLineTo(y = 8.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.7f, dx2 = -0.4f, dy2 = -1.4f, dx3 = -1.0f, dy3 = -1.7f)
                lineToRelative(dx = -7.0f, dy = -3.9f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.9f, dy1 = 0.0f)
                lineTo(x = 4.0f, y = 6.4f)
                curveTo(x1 = 3.4f, y1 = 6.8f, x2 = 3.0f, y2 = 7.5f, x3 = 3.0f, y3 = 8.2f)
            }
        }.build().also { _chainlink = it }
    }

@Suppress("ObjectPropertyName")
private var _chainlink: ImageVector? = null
