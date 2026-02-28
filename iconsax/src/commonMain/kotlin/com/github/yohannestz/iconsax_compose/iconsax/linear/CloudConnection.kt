package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudConnection: ImageVector
    get() {
        val current = _cloudConnection
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudConnection",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.37f, y = 9.51f)
                curveToRelative(dx1 = -4.08f, dy1 = 0.29f, dx2 = -4.07f, dy2 = 6.2f, dx3 = 0.0f, dy3 = 6.49f)
                horizontalLineToRelative(dx = 9.66f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.17f, dy1 = -1.22f)
                curveToRelative(dx1 = 2.86f, dy1 = -2.5f, dx2 = 1.33f, dy2 = -7.5f, dx3 = -2.44f, dy3 = -7.98f)
                curveTo(x1 = 15.41f, y1 = -1.34f, x2 = 3.62f, y2 = 1.75f, x3 = 6.41f, y3 = 9.51f)
                moveTo(x = 12.0f, y = 16.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 0.0f, dy = 4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.0f)
                moveToRelative(dx = 6.0f, dy = -2.0f)
                horizontalLineToRelative(dx = -4.0f)
                moveToRelative(dx = -4.0f, dy = 0.0f)
                horizontalLineTo(x = 6.0f)
            }
        }.build().also { _cloudConnection = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudConnection: ImageVector? = null
