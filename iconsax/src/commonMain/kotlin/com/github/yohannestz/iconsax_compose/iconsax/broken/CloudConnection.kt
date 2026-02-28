package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                moveTo(x = 6.41f, y = 9.51f)
                curveToRelative(dx1 = -2.79f, dy1 = -7.76f, dx2 = 9.0f, dy2 = -10.85f, dx3 = 10.35f, dy3 = -2.7f)
                curveToRelative(dx1 = 3.42f, dy1 = 0.42f, dx2 = 5.0f, dy2 = 4.58f, dx3 = 3.12f, dy3 = 7.21f)
                moveTo(x = 6.37f, y = 9.52f)
                curveToRelative(dx1 = -4.08f, dy1 = 0.28f, dx2 = -4.07f, dy2 = 6.2f, dx3 = 0.0f, dy3 = 6.48f)
                horizontalLineToRelative(dx = 9.66f)
                moveTo(x = 12.0f, y = 16.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = -2.0f, dy = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = 0.9f, dy2 = -2.0f, dx3 = 2.0f, dy3 = -2.0f)
                reflectiveCurveToRelative(dx1 = 2.0f, dy1 = 0.9f, dx2 = 2.0f, dy2 = 2.0f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = 2.0f, dx2 = -2.0f, dy2 = 2.0f)
                moveToRelative(dx = 6.0f, dy = -2.0f)
                horizontalLineToRelative(dx = -4.0f)
                moveToRelative(dx = -4.0f, dy = 0.0f)
                horizontalLineTo(x = 6.0f)
            }
        }.build().also { _cloudConnection = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudConnection: ImageVector? = null
