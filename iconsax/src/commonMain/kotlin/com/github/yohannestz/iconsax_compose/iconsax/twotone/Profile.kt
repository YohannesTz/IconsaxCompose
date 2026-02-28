package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Profile: ImageVector
    get() {
        val current = _profile
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Profile",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.16f, y = 10.87f)
                horizontalLineToRelative(dx = -0.33f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.27f, dy1 = -4.43f)
                arcTo(horizontalEllipseRadius = 4.44f, verticalEllipseRadius = 4.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 2.0f)
                arcToRelative(a = 4.43f, b = 4.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.16f, dy1 = 8.87f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.16f, y = 14.56f)
                curveToRelative(dx1 = -2.42f, dy1 = 1.62f, dx2 = -2.42f, dy2 = 4.26f, dx3 = 0.0f, dy3 = 5.87f)
                curveToRelative(dx1 = 2.75f, dy1 = 1.84f, dx2 = 7.26f, dy2 = 1.84f, dx3 = 10.0f, dy3 = 0.0f)
                curveToRelative(dx1 = 2.43f, dy1 = -1.62f, dx2 = 2.43f, dy2 = -4.26f, dx3 = 0.0f, dy3 = -5.87f)
                curveToRelative(dx1 = -2.73f, dy1 = -1.83f, dx2 = -7.24f, dy2 = -1.83f, dx3 = -10.0f, dy3 = 0.0f)
            }
        }.build().also { _profile = it }
    }

@Suppress("ObjectPropertyName")
private var _profile: ImageVector? = null
