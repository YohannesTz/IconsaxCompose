package com.github.yohannestz.iconsax_compose.iconsax.broken

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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.68f, y = 3.96f)
                arcToRelative(a = 4.44f, b = 4.44f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -8.09f, dy1 = 2.99f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.99f, y1 = 2.0f)
                moveToRelative(dx = -5.0f, dy = 12.56f)
                curveToRelative(dx1 = -2.42f, dy1 = 1.62f, dx2 = -2.42f, dy2 = 4.26f, dx3 = 0.0f, dy3 = 5.87f)
                curveToRelative(dx1 = 2.75f, dy1 = 1.84f, dx2 = 7.26f, dy2 = 1.84f, dx3 = 10.01f, dy3 = 0.0f)
                curveToRelative(dx1 = 2.42f, dy1 = -1.62f, dx2 = 2.42f, dy2 = -4.26f, dx3 = 0.0f, dy3 = -5.87f)
                curveToRelative(dx1 = -2.73f, dy1 = -1.83f, dx2 = -7.24f, dy2 = -1.83f, dx3 = -10.01f, dy3 = 0.0f)
            }
        }.build().also { _profile = it }
    }

@Suppress("ObjectPropertyName")
private var _profile: ImageVector? = null
